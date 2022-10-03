<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Formulario de Agregacion de Productos</h4>
    </div>
    <div class="informacion notas">
        <div class="funciones-profesor">
            <div class="mensaje-export">
                <a href="${pageContext.request.contextPath}/ServletControladorProducto" class="boton-rojo-radio-inline"><i class="fa-solid fa-ban"></i><h6>Cancelar</h6></a>
            </div>
        </div>

        <div class="tabla">
            <form action="${pageContext.request.contextPath}/ServletControladorProducto?accion=insertar" method="post">
                <div class="tercios-221">
                    <div>
                        <label for="nombres_t">Nombre</label>
                        <input type="text" id="nombres_t" class="block-100">
                    </div>
    
                    <div>
                        <label for="apellidos_t">Marca</label>
                        <input type="text" id="apellidos_t" class="block-100">
                    </div>
    
                    <div>
                        <label for="identificacion_t">Categoria</label>
                        <select id="identificacion_t" class="block-100">
                            <option selected value=""></option>
                            <option value="1">Monitor</option>
                            <option value="2"></option>
                            <option value="3"></option>
                            <option value="4"></option>
                        </select>
                    </div>
                </div>
    
                <div>
                    <label for="descripcion">Descripcion</label>
                    <input type="text" id="descripcion" class="block-100">
                </div>
    
                <div class="tercios-iguales">
                    <div>
                        <label for="proveedor">Proveedor</label>
                        <select id="proveedor" class="block-100">
                            <option selected value=""></option>
                            <option value="1">Tienda Electra</option>
                            <option value="2">Tienda G-MT</option>
                            <option value="3">Ferreteria Don Antonio</option>
                        </select>
                    </div>
    
                    <div>
                        <label for="fecha">Fecha</label>
                        <input type="date" id="fecha" class="block-100">
                    </div>
    
                    <div>
                        <label for="imagen">Imagen</label>
                        <input type="file" id="imagen" class="block-100">
                    </div>
                </div>
    
                <div class="cont-registro">
                    <input type="submit" class="boton-transparente btn-crear" value="Registrar Informacion">
                </div>
            </form>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>