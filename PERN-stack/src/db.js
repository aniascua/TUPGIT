import pg from "pg";


export const pool = pg.Pool({
    port = 5432,
    host: "localhost",
    user: "postgres",
    password: "admin",
    database: "PERN",
});

pool.on("connect", () => {
    console.log("conectado a la bd");
});