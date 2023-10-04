// importamos bibliotecas necesarias de express
const express = require("express");
const app = express();
const cors = require("cors");
// añadimos Mercadopago:
const mercadopago = require("mercadopago");
const path = require("path");

// REPLACE WITH YOUR ACCESS TOKEN AVAILABLE IN: https://developers.mercadopago.com/panel
mercadopago.configure({
	access_token: "TEST-numeroLargoConLetrasAlFinal",
});

// mas configuraciones 
app.use(express.urlencoded({ extended: false }));
app.use(express.json());

app.use(express.static(path.join(__dirname, "../client")));
app.use(cors());

app.get("/", function (req, res) {
    res.status(200).sendFile(path.join(__dirname, "../client/media", "index.html"));
});

// Ruta para crear una preferencia de pago
app.post("/create_preference", (req, res) => {
	let preference = {
		items: [
			{
				title: req.body.description,
				unit_price: Number(req.body.price),
				quantity: Number(req.body.quantity),
			}
		],
		back_urls: {
			"success": "http://localhost:8080",
			"failure": "http://localhost:8080",
			"pending": "",
		},
		auto_return: "approved",
	};

	// Creación de la preferencia de pago en Mercado Pago
	mercadopago.preferences.create(preference)
		.then(function (response) {
			res.json({
				id: response.body.id
			});
		}).catch(function (error) {
			console.log(error);
		});
});

// Ruta para manejar el feedback después del pago
app.get('/feedback', function (req, res) {
	res.json({
		Payment: req.query.payment_id,
		Status: req.query.status,
		MerchantOrder: req.query.merchant_order_id
	});
});

// Iniciar el servidor en el puerto 8080
app.listen(8080, () => {
	console.log("The server is now running on Port 8080");
});