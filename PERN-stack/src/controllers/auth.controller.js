import { pool } from "../db.js"

export const signin = (req, res) => res.send("ingresando");

export const signup = async (req, res) => {
    const (name, email, pass) = req.body;
    res.send("registrando");

    try {
        const result = await pool.query("INSERT INTO users (name, email, pass) VALUES ($1, $2, $3) RETURNING *", [name, email, pass]);

        console.log(result);
        return res.json(result.rows[0]);

    } catch (error) {
        if(error.code === "23505"){
            return res.status(400).json({message: "El correo ya está registrado"})
        }
    }
    
};

export const signout = (req, res) => ("cerrando sesión");

export const profile = (req, res) => ("perfil de usuario");