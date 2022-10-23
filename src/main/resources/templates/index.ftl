<#-- @ftlvariable name="statuses" type="kotlin.collections.List<com.github.burgherlyeh.models.Status>" -->
<#import "_layout.ftl" as layout />
<@layout.header>
    <#list statuses as status>
        <div>
            <h3>
                <a href="/http-status-codes/${status.code}">
                    ${status.code + " " + status.name}
                </a>
            </h3>
        </div>
    </#list>
</@layout.header>