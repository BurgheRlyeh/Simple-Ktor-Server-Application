<#-- @ftlvariable name="status" type="com.github.burgherlyeh.models.Status" -->
<#import "_layout.ftl" as layout />
<@layout.header>
    <div>
        <h2>
            ${status.name}
        </h2>
        <img src="https://http.cat/${status.code}">
        <h3>
            ${status.description}
        </h3>
        <hr>
    </div>
</@layout.header>