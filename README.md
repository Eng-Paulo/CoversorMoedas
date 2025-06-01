# 💰 API – CONVERSOR DE MOEDAS

![Status](https://img.shields.io/badge/Status-em%20desenvolvimento-brightgreen)
![Java](https://img.shields.io/badge/Java-24-blue)
![API REST](https://img.shields.io/badge/API-REST-blue)
![JSON](https://img.shields.io/badge/Retorno-JSON-yellow)
![IntelliJ](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-orange)

## 🚀 Sobre a aplicação
Esta é uma API simples e eficiente para **conversão de moedas**, permitindo que você obtenha taxas de câmbio atualizadas e converta valores entre diferentes moedas globais. Ideal para aplicações financeiras, e-commerce, calculadoras de viagem ou qualquer sistema que necessite de informações de câmbio precisas e em tempo real.
Utiliza dados de cotação de uma **API externa confiável** (substituir o link de exemplo pela API real que você usa) para garantir a precisão das conversões.


---

## ⚙️ Funcionalidades

-   Conversão de valores entre diversas moedas (ex: USD, EUR, BRL, JPY, etc.)
-   Consulta de taxas de câmbio atualizadas.
-   Interface RESTful simples e intuitiva.
-   Respostas padronizadas em formato JSON.
-   Fácil integração com outras aplicações.

---

## 📚 Documentação Oficial

- [Class HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html).
- [Class HttpRequest](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpRequest.html).
- [Interface HttpResponse](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html).
- [Class Scanner](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html).

---

## 💻 Como usar

### Endpoint Principal

A API disponibiliza um endpoint principal para realizar a conversão.

#### 📌 Requisição

```http
GET /convert?from={moeda_origem}&to={moeda_destino}&amount={valor}
