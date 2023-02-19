<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
    <body>
        <h2>Crédit restant : ${balance}</h2>
        <table>
            <caption>Liste des produits</caption>
            <tr>
                <th>Numéro de produit</th>
                <th>Nom</th>
                <th>Quantité</th>
                <th>Prix</th>
            </tr>

            <c:forEach var="p" items="${stock}">
                <tr>
                    <td><c:out value="${p.getId()}"/></td>
                    <td><c:out value="${p.getNom()}"/></td>
                    <td><c:out value="${p.getQuantite()}"/></td>
                    <td><c:out value="${p.getPrix()}"/></td>
                </tr>
            </c:forEach>

        </table>

        <br />
        <form:form method="POST" action="/addCredit" modelAttribute="userForm" >
            <fieldset>
                <legend>Ajouter du crédit</legend>
                <p>
                    <form:label path="creditToAdd">Montant: </form:label>
                    <form:input type="number" path="creditToAdd" />
                </p>
                <input name="credit" type="submit" value="Ajouter" />
            </fieldset>
        </form:form>
        <br />  

        <form:form method="POST" action="/buyProduct" modelAttribute="buyForm" >
            <fieldset>
                <legend>Acheter un produit avec son id:</legend>
                <p>
                    <form:label path="idToFind">Montant: </form:label>
                    <form:input type="number" path="idToFind" />
                </p>
                <input name="Produit" type="submit" value="Acheter" />
            </fieldset>
        </form:form>

    </body>
</html>
