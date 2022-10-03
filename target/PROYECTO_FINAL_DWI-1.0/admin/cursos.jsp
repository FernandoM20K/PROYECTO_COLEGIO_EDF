<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Lista de Cursos</h4>
    </div>
    <div class="informacion notas">
        <div class="funciones-profesor">
            <div class="mensaje-export">
                <a href="agregarCurso.jsp" class="boton-verde-radio-inline"><i class="fa-solid fa-plus"></i><h6>Agregar Curso</h6></a>
            </div>
            
            <h6>Total de Cursos: ${totalCursos}</h6><!--Cambiar el numero al conectar a una BD-->
        </div>

        <div class="tabla t-profesores">
            <table>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Nombre del Curso</th>
                        <th>Horas Academicas</th>
                        <th>Opcion</th>
                    </tr>
                </thead>
                <tbody>
                    <!--INICIO ITERACION DE CADA ELEMENTO DE LA LISTA DE PROFESORES-->
                    <c:forEach var="curso" items="${cursos}">
                        <tr>
                            <td>${curso.idCurso}</td>
                            <td>${curso.nombre}</td>
                            <td>${curso.horasAcademicas}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/ServletControladorCurso?accion=editar&idCurso=${curso.idCurso}" class="boton-yellowgreen-radio-inline">
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