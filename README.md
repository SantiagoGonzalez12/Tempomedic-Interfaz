# Tempomedic-Interfaz

<img src="docs/img/logo/Logo_Tempomedic.svg" alt="Logo" width="100%" height="100">

Interfaz de la Aplicación de salud en Java (Swing/MVC) para gestionar medicación y citas médicas: recordatorios por notificación o alarma, e historial de tomas. Proyecto Intermodular DAM.

Repositorio principal: <https://github.com/SantiagoGonzalez12/Tempomedic>

## Índice

1. [El problema](#1-el-problema)
2. [Identificación del público objetivo](#2-identificación-del-público-objetivo)
3. [Las decisiones técnicas](#3-las-decisiones-técnicas)
4. [Objetivos Principales de la Interfaz (UI/UX)](#4-objetivos-principales-de-la-interfaz-uiux)
5. [El proceso de trabajo](#5-el-proceso-de-trabajo)
6. [Las pruebas](#6-las-pruebas)
7. [El resultado obtenido](#7-el-resultado-obtenido)

---

## 1. El problema

Siempre se ha tenido el problema de "¿A que hora me toca la medicación?" y se nos olvida tomarla. Esto puede desencadenar severos problemas y afectar gravemente a la salud. No todo queda ahí, además, el proceso de poder coger cita médica es apps públicas o mismamente presencial provoca "desesperación" a las personas. Por lo cuál se ha decidido desarrollar una app que cubra estas necesidades y que ayude positivamente a la toma de los medicamentos. 

## 2. Identificación del Público Objetivo

La aplicación está diseñada para responder a las necesidades de gestión de salud de diferentes perfiles de usuarios. Tras el análisis de la encuesta y las necesidades del sector, se han identificado tres grupos principales de público objetivo:

### 2.1. Pacientes con Tratamientos Temporales u Ocasionales

* **Perfil:** Personas jóvenes o adultas que toman medicamentos durante un periodo concreto (antibióticos, analgésicos o tratamientos de 7 a 15 días).
* **Necesidad principal:** Necesitan un sistema de alertas preciso que no dependa de acordarse manualmente del horario entre tomas, cada ocho horas por ejemplo.
* **Solución que les ofrece la app:** Programación rápida de avisos con fecha de inicio y fin evitando olvidos por distracciones en su rutina

### 2.2. Pacientes Crónicos o con numero elevado de pastillas

* **Perfil:** Personas adultas o de avanzada edad que deben tomar varios medicamentos al día de forma continuada y acudir a revisiones médicas periódicas.
* **Necesidad principal:** Evitar confusiones con las dosis, los horarios y no perder las citas de seguimiento con sus médicos.  

## 3. Las decisiones técnicas

## 4.  Objetivos Principales de la Interfaz (UI/UX)

Puedes encontrar los bocetos de la interfaz en `docs\img\BocetosVistas` o en la [previsualización de Figma](https://www.figma.com/proto/ubk5OfKsRbFFkuf4rPfQUt/Tempomedic-%E2%80%93-Bocetos-Sprint-1--D2-?node-id=2-23&p=f&t=8uHJ1BrWqsgY0J3Z-1&scaling=scale-down&content-scaling=fixed&page-id=0%3A1&starting-point-node-id=2%3A2).

El diseño de la interfaz de **Tempomedic** se ha estructurado para ofrecer una experiencia sencilla, accesible y adaptada a las necesidades obtenidas en la encuesta. Los objetivos  del diseño son:

### Centralización en un Dashboard Diario ("Hoy")

* **Vista unificada:** La pantalla principal consolida en un único vistazo las tomas de medicación pendientes/completadas y las próximas citas médicas programadas
* **Gestión de estados rápida:** Permite cambiar el estado de las tomas con botones directos de *"Tomada"*, *"Posponer"* u *"Omitida"* sin tener que navegar por varios menús

### Navegación Sencilla e Intuitiva

* **Navegación inferior fija :** La aplicación utiliza una barra principal con 4 secciones  definidas (*Hoy*, *Medicamentos*, *Citas*, *Ajustes*) para permitir un acceso rápido a cualquier función en 1 solo clic
* **Formularios estructurados:** Las pantallas para añadir o editar medicamentos y citas emplean un diseño limpio mediante campos de selección y menús desplegables para agilizar la introducción de datos

### Personalización y Accesibilidad Universal

* **Ajuste de visibilidad y temas:** Desde la sección de ajustes, el usuario puede adaptar el tamaño del texto (*Normal*, *Grande*, *Muy grande*) y alternar entre tema *Claro* u *Oscuro* para facilitar la lectura a personas con visión reducida
* **Notificaciones a medida:** Permite configurar de forma global o individual el tipo de aviso (*Notificación*, *Alarma* o *Ambos*), respondiendo a la diversidad de preferencias detectada en los usuarios

### Seguridad, Privacidad y Feedback Claro

* **Protección mediante PIN de acceso:** Implementación de una pantalla de desbloqueo rápido por PIN como capa extra de seguridad para los datos médicos del usuario
* **Feedback:** La interfaz confirma las acciones del usuario de forma transparente

## 5. El proceso de trabajo

## 6. Las pruebas

## 7. El resultado obtenido
