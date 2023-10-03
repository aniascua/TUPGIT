import { pool } from "../db.js";

export const listarTareas = async (req, res) => {
    const resultado = await pool.query("SELECT * FROM tareas");
    console.log(resultado);
    return res.json(resultado.rows);
}

export const listarTarea = async (req, res) => {
    const resultado = await pool.query("SELECT ¨FROM tareas WHERE id = $1", [req.params.id]);
    return res.json(resultado.rows);
}


export const crearTarea = async (req, res, next) => {
    const { titulo, desc } = req.body;

    try {
        const result = await pool.query('INSERT INTO tareas (titulo, desc) VALUES ($1, $2) RETURNING *', [titulo, desc]);
        res.json(result.rows);
    } catch (error) {
        if (error.code === "23505") {
            return res.status(409).json({
                message: "Ya existe una tarea con ese título"
            });
        }
        console.error(error);
        next(error);
    }
}


export const actualizarTarea = (req, res) => res.send('actualizando tarea única');

export const eliminarTarea = async (req, res) => {
    try {
        const resultado = await pool.query("DELETE FROM tareas WHERE id = $1", [req.params.id]);

        if (resultado.rowCount === 0) {
            return res.status(404).json({
                message: "No existe una tarea con ese ID"
            });
        }

        return res.sendStatus(204);
    } catch (error) {
        console.error("Error al eliminar la tarea:", error);
        return res.status(500).json({
            message: "Error interno del servidor al eliminar la tarea"
        });
    }
}