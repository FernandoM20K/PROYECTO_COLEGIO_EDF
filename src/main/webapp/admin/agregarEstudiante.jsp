<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Agregar Estudiante</h4>
    </div>
    <div class="informacion notas">
        <div class="funciones-profesor">
            <div class="mensaje-export">
                <a href="${pageContext.request.contextPath}/ServletControladorProfesor" class="boton-rojo-radio-inline"><i class="fa-solid fa-ban"></i><h6>Cancelar</h6></a>
            </div>
        </div>

        <div class="tabla">
            <form action="${pageContext.request.contextPath}/ServletControladorProfesor?accion=insertar" method="post">
                <!-- <h6 class="alerta ms-error">INFORMACION DE ERROR</h6>
                <h6 class="alerta ms-error">INFORMACION DE ERROR</h6>
                <h6 class="alerta ms-error">INFORMACION DE ERROR</h6>
                <h6 class="alerta ms-error">INFORMACION DE ERROR</h6>
                <h6 class="alerta ms-error">INFORMACION DE ERROR</h6> -->

                <div class="mitad">
                    <div class="datos-rojo">
                        <label for="nombre-es">Nombres*</label>
                        <input type="text" id="nombre-es" class="block-100">
                    </div>

                    <div class="datos-rojo">
                        <label for="apellido-es">Apellidos*</label>
                        <input type="text" id="apellido-es" class="block-100">
                    </div>
                </div>

                <div>
                    <fieldset>
                        <legend>Datos del Estudiante</legend>
                        <div class="sede">
                            <label for="sede">Sede</label>
                            <select id="sede" class="block-100">
                                <option selected value=""></option>
                                <option value="1">Sede Lima</option>
                                <option value="2">Sede Ica</option>
                                <option value="3">Sede Ayacucho</option>
                                <option value="4">D</option>
                                <option value="5">E</option>
                                <option value="6">F</option>
                                <option value="5">G</option>
                                <option value="6">H</option>
                            </select>
                        </div>
                        
                        <div>
                            <label for="edad">Edad</label>
                            <input type="number" id="edad" class="block-100" min="11">
                        </div>

                        <div>
                            <label for="nacionalidad">Nacionalidad</label>
                            <input type="text" id="nacionalidad" class="block-100">
                        </div>

                        <div>
                            <label for="direccion">Direccion</label>
                            <input type="text" id="direccion" class="block-100" min="11">
                        </div>

                        <div>
                            <label for="sexo">Sexo</label>
                            <select id="sexo" class="block-100">
                                <option selected value=""></option>
                                <option value="1">Masculino</option>
                                <option value="2">Femenino</option>
                            </select>
                        </div>

                        <div>
                            <label for="identificacion">DNI / CE</label>
                            <input type="number" id="identificacion" class="block-100">
                        </div>

                        <div>
                            <label for="fechaIngreso">Fecha Ingreso</label>
                            <input type="date" id="fechaIngreso" class="block-100">
                        </div>
                    </fieldset>
                </div>
            </form>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>