<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Lista de Profesores</h4>
    </div>
    <div class="informacion notas">
        <div class="funciones-profesor">
            <div class="mensaje-export">
                <a href="AgregarProfesor.jsp" class="boton-verde-radio-inline"><i class="fa-solid fa-pen"></i><h6>Redactar Mensaje</h6></a>
                <a href="AgregarProfesor.jsp" class="boton-morado-radio-inline"><i class="fa-duotone fa-mailbox"></i><h6>Mensajes Recibidos</h6></a>
                <a href="AgregarProfesor.jsp" class="boton-morado-radio-inline"><i class="fa-solid fa-paper-plane"></i><h6>Mensajes Enviados</h6></a>
            </div>
            
            <h6>Total de Mensajes: </h6><!--Cambiar el numero al conectar a una BD-->
        </div>

        
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>