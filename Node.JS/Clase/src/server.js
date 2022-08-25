require('dotenv').config();
const express = require('express');

    const routes = require('./routes/index.routes');
    const app = express();

    app.set('port', process.env.PORT || 3000);
    
    //Rutas
    app.use('/', routes);

    //Settings
    app.use(express.urlencoded({extended: false}));
    app.use(express.json());
    app.use(cors());

    module.exports = server;