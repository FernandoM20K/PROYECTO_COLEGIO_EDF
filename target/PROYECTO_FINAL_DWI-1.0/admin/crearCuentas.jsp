<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Creacion de Cuentas</h4>
    </div>
    <div class="creacion-cuentas">
        <div class="info-estudiante">
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
                    <div class="mitad">
                        <div class="seccion">
                            <label for="seccion">Sección</label>
                            <select id="seccion" class="block-100">
                            <option selected value=""></option>
                                <option value="1">A</option>
                                <option value="2">B</option>
                                <option value="3">C</option>
                                <option value="4">D</option>
                                <option value="5">E</option>
                                <option value="6">F</option>
                                <option value="5">G</option>
                                <option value="6">H</option>
                            </select>
                        </div>

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
                        <label for="fechaIngreso">Fecha Ingreso</label>
                        <input type="date" id="fechaIngreso" class="block-100">
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
                </fieldset>
            </div>
        </div>

        <div class="info-apoderado">
            <h6>Datos Adicionales</h6>

            <div>
                <label for="direccion">Dirección</label>
                <input type="text" id="direccion" class="block-100">
            </div>

            <div class="mitad">
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

            <div class="cont-registro">
                <input type="submit" class="boton-transparente btn-crear" value="Registrar Informacion">
            </div>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>