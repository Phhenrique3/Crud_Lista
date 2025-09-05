## CRUD de Produtos

Este projeto é uma API RESTful desenvolvida com Spring Boot para gerenciar uma lista de produtos. Permite operações de criação, leitura, atualização e exclusão (CRUD) de produtos.

### Estrutura do Produto

Cada produto possui os seguintes campos:

- `id`: Long
- `nome`: String
  `marca`: String
- `preco`: double

### Rotas da API

Todas as rotas estão sob o endpoint base `/produtos`.

#### 1. Listar todos os produtos

**GET** `/produtos`
Exemplo de requisição:

```
GET http://localhost:8080/produtos
```

Exemplo de resposta:

```json
[
  {
    "nome": "Teclado",
    "marca": "Dell",
    "preco": 120.0
  },
  {
    "id": 2,
    "nome": "Mouse",
    "marca": "Dell",
    "preco": 80.0
  }
]
```

#### 2. Buscar produto por ID

**GET** `/produtos/{id}`
Exemplo de requisição:

```
GET http://localhost:8080/produtos/1
```

Exemplo de resposta:

```json
{
  "id": 1,
  "nome": "Teclado",
  "marca": "Dell",
  "preco": 120.0
}
```

Se não encontrado:

```
Status: 404 Not Found
```

#### 3. Criar novo produto

**POST** `/produtos`
Exemplo de requisição:

```
POST http://localhost:8080/produtos
Content-Type: application/json

{
	"nome": "Monitor",
	"preco": 900.0
}
```

Exemplo de resposta:

```json
{
  "id": 3,
  "nome": "Monitor",
  "marca": "Dell",
  "preco": 900.0
}
```

#### 4. Atualizar produto

**PUT** `/produtos/{id}`
Exemplo de requisição:

```
PUT http://localhost:8080/produtos/1
Content-Type: application/json

{
	"nome": "Teclado Mecânico",
	"preco": 200.0
}
```

Exemplo de resposta:

```json
{
  "id": 1,
  "nome": "Teclado Mecânico",
  "marca": "Dell",
  "preco": 200.0
}
```

Se não encontrado:

```
Status: 404 Not Found
```

#### 5. Deletar produto

**DELETE** `/produtos/{id}`
Exemplo de requisição:

```
DELETE http://localhost:8080/produtos/1
```

Exemplo de resposta:

```
Status: 204 No Content
```

Se não encontrado:

```
Status: 404 Not Found
```

### Como executar

1. Certifique-se de ter o Java 17+ instalado.
2. Execute o comando:

```bash
./gradlew bootRun
```

3. Acesse os endpoints usando ferramentas como Postman ou Insomnia.

### Observações

- O projeto não utiliza banco de dados, os dados são mantidos em memória.
- Para testes, utilize os endpoints conforme exemplos acima.

---

Desenvolvido para fins acadêmicos.
