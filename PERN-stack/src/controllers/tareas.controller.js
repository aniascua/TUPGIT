import { pool } from "../db.js";

export const listarTareas = async(req, res) => {
    const resultado = await pool.query("SELECT * FROM tareas");
    console.log(resultado);
    return res.json(resultado.rows);
}

export const listarTarea = (req, res) => res.send('obteniendo tarea única');

export const crearTarea = (req, res, next) => {
    const { titulo, desc } = req.body;

    try {
        const result = await pool.query('INSERT INTO tareas (titulo, desc) VALUES ($1, $2) RETURNING *', [titulo, desc]);
        res.json(result.rows);
    } catch (e) {
        if (error.code === "23505") {
            return res.send("ya existe una tarea con ese título");
        }
        console.log(Error);
        next(error);
    }
}

export const actualizarTarea = (req, res) => res.send('actualizando tarea única');

export const eliminarTarea = (req, res) => res.send('eliminando tarea única');