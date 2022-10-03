<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Lista de Salones</h4>
    </div>
    <div class="informacion notas">
        <div class="funciones-profesor">
            <div class="mensaje-export">
                <a href="${pageContext.request.contextPath}/ServletControladorSalon?accion=listarSedes" class="boton-verde-radio-inline"><i class="fa-solid fa-user-plus"></i><h6>Agregar Salon</h6></a>
            </div>
            
            <h6>Total de Registros: ${totalSalones}</h6><!--Cambiar el numero al conectar a una BD-->
        </div>

        <div class="tabla t-profesores">
            <table>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Sede</th>
                        <th>Grado</th>
                        <th>Seccion</th>
                        <th>Nro Max de Estudiantes</th>
                        <th>Opcion</th>
                    </tr>
                </thead>
                <tbody>
                    <!--INICIO ITERACION DE CADA ELEMENTO DE LA LISTA DE PROFESORES-->
                    <c:forEach var="salon" items="${salones}">
                        <tr>
                            <td>${salon.idSalon}</td>
                            <td>${salon.nombreSede}</td>
                            <td>${salon.grado}</td>
                            <td>${salon.seccion}</td>
                            <td>${salon.nroMax}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/ServletControladorSalon?accion=editar&idSalon=${salon.idSalon}" class="boton-yellowgreen-radio-inline">
                                    <h4>
                                        <i class="fas fa-angle-double-right"> Editar</i>
                                    </h4>
                                </a>
                            </td>
                        </tr>
                    </c:forEach><!--FIN ITERACION DE CADA ELEMENTO DE LA LISTA DE PROFESORES-->
                </tbody>
            </table>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>