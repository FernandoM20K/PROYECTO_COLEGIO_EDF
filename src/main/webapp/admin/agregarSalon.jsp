<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Formulario Agregado de Salones</h4>
    </div>
    <div class="informacion notas">
        <div class="funciones-profesor">
            <div class="mensaje-export">
                <a href="${pageContext.request.contextPath}/ServletControladorSalon" class="boton-rojo-radio-inline"><i class="fa-solid fa-ban"></i><h6>Cancelar</h6></a>
            </div>
        </div>

        <div class="tabla">
            <form action="${pageContext.request.contextPath}/ServletControladorSalon?accion=insertar" method="post">
                <div>
                    <label for="sede">Sede</label>
                    <select id="sede" name="sede" class="block-100" required>
                        <option selected value=""></option>
                        <!--INICIO ITERACION DE CADA ELEMENTO DE LA LISTA DE SEDES-->
                        <c:forEach var="sede" items="${sedes}">
                            <option value="${sede.idSede}">${sede.direccion}</option>
                        </c:forEach><!--FIN ITERACION DE CADA ELEMENTO DE LA LISTA DE SEDES-->
                    </select>
                </div>

                <div>
                    <label for="grado">Grado</label>
                    <input type="number" id="grado" name="grado" class="block-100" required>
                </div>

                <div>
                    <label for="seccion">Seccion</label>
                    <input type="text" id="seccion" name="seccion" class="block-100" required>
                </div>

                <div>
                    <label for="nroMax">Numero Maximo de Estudiantes</label>
                    <input type="number" id="nroMax" name="nroMax" class="block-100" required>
                </div>
    
                <div class="cont-registro">
                    <button type="submit" class="boton-transparente btn-crear"><i class="fa-solid fa-dragon"></i> Guardar Informacion</button>
                </div>
            </form>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>