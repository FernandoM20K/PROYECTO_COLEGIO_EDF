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

                <div>
                    <label for="idEstudiante">Estudiante</label>
                    <select id="idEstudiante" class="block-100">
                        <option selected value=""></option>
                        <option value="1">Claro</option>
                    </select>
                </div>

                <div class="tercios-221">
                    <div>
                        <label for="nombres_t">Nombres</label>
                        <input type="text" id="nombres_t" class="block-100">
                    </div>

                    <div>
                        <label for="apellidos_t">Apellidos</label>
                        <input type="text" id="apellidos_t" class="block-100">
                    </div>

                    <div>
                        <label for="identificacion_t">DNI / CE</label>
                        <input type="number" id="identificacion_t" class="block-100">
                    </div>
                </div>

                <div>
                    <label for="direccion">Dirección</label>
                    <input type="text" id="direccion" class="block-100">
                </div>

                <div class="tercios-iguales">
                    <div>
                        <label for="operador">Operador</label>
                        <select id="operador" class="block-100">
                            <option selected value=""></option>
                            <option value="1">Claro</option>
                            <option value="2">Movistar</option>
                            <option value="3">Entel</option>
                            <option value="4">Bitel</option>
                        </select>
                    </div>

                    <div>
                        <label for="telefono">Telefono</label>
                        <input type="number" id="telefono" class="block-100">
                    </div>

                    <div>
                        <label for="sexo_t">Sexo</label>
                        <select id="sexo_t" class="block-100">
                            <option selected value=""></option>
                            <option value="1">Masculino</option>
                            <option value="2">Femenino</option>
                        </select>
                    </div>
                </div>

                <div class="tercios-211">
                    <div>
                        <label for="pais">País</label>
                        <select id="pais" class="block-100">
                            <option value="1"></option>
                            <option value="2"></option>
                            <option value="3"></option>
                            <option value="4"></option>
                        </select>
                    </div>

                    <div>
                        <label for="ciudad">Ciudad</label>
                        <select id="ciudad" class="block-100">
                            <option value="1"></option>
                            <option value="2"></option>
                            <option value="3"></option>
                            <option value="4"></option>
                        </select>
                    </div>

                    <div>
                        <label for="distrito">Distrito</label>
                        <select id="distrito" class="block-100">
                            <option value="1"></option>
                            <option value="2"></option>
                        </select>
                    </div>
                </div>

                <div>
                    <label for="email">E-mail</label>
                    <input type="email" id="email" class="block-100">
                </div>

                <div>
                    <label for="relacion">Relacion con el Estudiante</label>
                    <input type="text" id="relacion" class="block-100">
                </div>

                <div class="cont-registro">
                    <button type="submit" class="boton-transparente btn-crear"><i class="fa-solid fa-dragon"></i> Guardar Informacion</button>
                </div>
            </form>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>