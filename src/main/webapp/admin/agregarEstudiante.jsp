<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Agregar Estudiante</h4>
    </div>
    <div class="informacion notas">
        <div class="funciones-profesor">
            <div class="mensaje-export">
                <a href="${pageContext.request.contextPath}/ServletControladorEstudiante" class="boton-rojo-radio-inline"><i class="fa-solid fa-ban"></i><h6>Cancelar</h6></a>
            </div>
        </div>

        <div class="tabla">
            <form action="${pageContext.request.contextPath}/ServletControladorEstudiante?accion=insertar" method="post">
                <!-- <h6 class="alerta ms-error">INFORMACION DE ERROR</h6>
                <h6 class="alerta ms-error">INFORMACION DE ERROR</h6>
                <h6 class="alerta ms-error">INFORMACION DE ERROR</h6>
                <h6 class="alerta ms-error">INFORMACION DE ERROR</h6>
                <h6 class="alerta ms-error">INFORMACION DE ERROR</h6> -->

                <div class="mitad">
                    <div class="datos-rojo">
                        <label for="nombres">Nombres*</label>
                        <input type="text" id="nombres" name="nombres" class="block-100" required>
                    </div>

                    <div class="datos-rojo">
                        <label for="apellidos">Apellidos*</label>
                        <input type="text" id="apellidos" name="apellidos" class="block-100" required>
                    </div>
                </div>

                <div>
                    <fieldset>
                        <legend>Datos del Estudiante</legend>
                        <div class="sede">
                            <label for="idSede">Sede</label>
                            <select id="idSede" name="idSede" class="block-100" required>
                                <option selected value=""></option>
                                <!--INICIO ITERACION DE CADA ELEMENTO DE LA LISTA DE SEDES-->
                                <c:forEach var="sede" items="${sedes}">
                                    <option value="${sede.idSede}">${sede.nombre}</option>
                                </c:forEach><!--FIN ITERACION DE CADA ELEMENTO DE LA LISTA DE SEDES-->
                            </select>
                        </div>
                        
                        <div>
                            <label for="edad">Edad</label>
                            <input type="number" id="edad" name="edad" class="block-100" min="11" required>
                        </div>

                        <div>
                            <label for="direccion">Direccion</label>
                            <input type="text" id="direccion" name="direccion" class="block-100" min="11" required>
                        </div>

                        <div>
                            <label for="genero">Genero</label>
                            <select id="genero" name="genero" class="block-100" required>
                                <option selected value=""></option>
                                <option value="M">Masculino</option>
                                <option value="F">Femenino</option>
                            </select>
                        </div>

                        <div>
                            <label for="dni">DNI</label>
                            <input type="number" id="dni" name="dni" class="block-100" required>
                        </div>

                        <div>
                            <label for="fechaIngreso">Fecha Ingreso</label>
                            <input type="date" id="fechaIngreso" name="fechaIngreso" class="block-100" required>
                        </div>
                    </fieldset>
                </div>
            </form>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>