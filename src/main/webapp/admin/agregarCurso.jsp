<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Formulario de Agregacion de Cursos</h4>
    </div>
    <div class="informacion notas">
        <div class="funciones-profesor">
            <div class="mensaje-export">
                <a href="${pageContext.request.contextPath}/ServletControladorCurso" class="boton-rojo-radio-inline"><i class="fa-solid fa-ban"></i><h6>Cancelar</h6></a>
            </div>
        </div>

        <div class="tabla">
            <form action="${pageContext.request.contextPath}/ServletControladorCurso?accion=insertar" method="post">
                <div>
                    <label for="nombre">Nombre del Curso</label>
                    <input type="text" id="nombre" name="nombre" class="block-100" required>
                </div>

                <div>
                    <label for="horasAcademicas">Horas academicas del Curso</label>
                    <input type="number" id="horasAcademicas" name="horasAcademicas" class="block-100" required>
                </div>
    
                <div class="cont-registro">
                    <input type="submit" class="boton-transparente btn-crear" value="Registrar Informacion">
                </div>
            </form>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>