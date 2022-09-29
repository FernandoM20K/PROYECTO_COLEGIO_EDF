<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Lista de Profesores</h4>
    </div>
    <div class="informacion notas">
        <div class="funciones-profesor">
            <div class="mensaje-export">
                <a href="${pageContext.request.contextPath}/ServletControladorProfesor" class="boton-rojo-radio-inline"><i class="fa-solid fa-ban"></i><h6>Cancelar</h6></a>
            </div>
        </div>

        <div class="tabla">
            <form action="${pageContext.request.contextPath}/ServletControladorProfesor?accion=modifciar&idProfesor=${profesor.idProfesor}" method="post">
                <div class="tercios-221">
                    <div>
                        <label for="nombresProfesor">Nombres</label>
                        <input type="text" id="nombresProfesor" name="nombresProfesor" class="block-100" required value="${profesor.nombre}">
                    </div>
    
                    <div>
                        <label for="apellidosProfesor">Apellidos</label>
                        <input type="text" id="apellidosProfesor" name="apellidosProfesor" class="block-100" required value="${profesor.apellido}">
                    </div>
    
                    <div>
                        <label for="dniProfesor">Dni</label>
                        <input type="number" id="dniProfesor" name="dniProfesor" class="block-100" required value="${profesor.dni}">
                    </div>
                </div>
    
                <div>
                    <label for="direccionProfesor">Direccion</label>
                    <input type="text" id="direccionProfesor" name="direccionProfesor" class="block-100" required value="${profesor.direccion}">
                </div>
    
                <div>
                    <label for="emailProfesor">Email</label>
                    <input type="text" id="emailProfesor" name="emailProfesor" class="block-100" required value="${profesor.email}">
                </div>
    
                <!--CORREGIR LA PARTE DE ABAJO-->
                <div class="tercios-iguales">
                    <div>
                        <label for="generoProfesor">Genero</label>
                        <select id="generoProfesor" name="generoProfesor" class="block-100" required value="${profesor.genero}">
                            <!--<c:set var="genero" value="${profesor.genero}" />
                            <c:if test="${genero.equals('M')}">
                                <option value=""></option>
                                <option value="M" selected>Masculino</option>
                                <option value="F">Femenino</option>
                            </c:if> -->
                            <option value=""></option>
                            <option value="M">Masculino</option>
                            <option value="F" selected>Femenino</option>
                        </select>
                    </div>
    
                    <div>
                        <label for="telefonoProfesor">Nro Telefono</label>
                        <input type="number" id="telefonoProfesor" name="telefonoProfesor" class="block-100" required value="${profesor.telefono}">
                    </div>
    
                    <div>
                        <label for="celularProfesor">Nro Celular</label>
                        <input type="number" id="celularProfesor" name="celularProfesor" class="block-100" required value="${profesor.celular}">
                    </div>
                </div>
    
                <div>
                    <label for="sueldoProfesor">Sueldo</label>
                    <input type="number" id="sueldoProfesor" name="sueldoProfesor" class="block-100" required value="${profesor.sueldo}">
                </div>
    
                <div class="cont-registro">
                    <button type="submit" class="boton-transparente btn-crear"><i class="fa-solid fa-dragon"></i> Guardar Informacion</button>
                </div>
            </form>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>