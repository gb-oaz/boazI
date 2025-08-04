# 🔐 Fluxo de Utilização da API de Autenticação

## 1. Obter Token Anônimo

**Endpoint:**

`POST /auth/v1/post/anonymous/token/COMMAND_POST_ANONYMOUS_TOKEN`

**Uso:**

Utilizado como primeiro passo para interações. Gera um token anônimo para ser usado nas próximas requisições.

**Resposta:**

```json
{
  "token": "Bearer <anonymous-token>",
  "createAt": "2024-09-23T10:00:00Z",
  "expiryAt": "2024-09-24T10:00:00Z",
  "status": "ACTIVE"
}
```

---

## 2. Login e Geração de Token de Acesso

**Endpoint:**

`POST /auth/v1/post/sign/in/token/COMMAND_POST_SIGN_IN_TOKEN`

**Headers:**

```
Authorization: Bearer <anonymous-token>
Content-Type: multipart/form-data
```

**Body:**

- `login`: mínimo 8 caracteres, letras maiúsculas.

- `code`: mínimo 6 dígitos numéricos.

- `password`: mínimo 15 caracteres, com letras maiúsculas, minúsculas, números e especiais.

**Resposta:**

```json
{
  "token": "Bearer <access-token>",
  "createAt": "2024-09-23T10:00:00Z",
  "expiryAt": "2024-09-24T10:00:00Z",
  "status": "ACTIVE"
}
```

---

## 3. Validar Status do Token

**Endpoint:**

`GET /auth/v1/get/status/token/QUERY_GET_STATUS_TOKEN`

**Headers:**
```
Authorization: Bearer <access-token>
```

**Resposta:**

```json
{
  "status": "ACTIVE"
}
```

---

## 4. Validar Scope do Token

**Endpoint:**

`GET /auth/v1/get/scope/token/QUERY_GET_SCOPE_TOKEN`

**Headers:**
```
Authorization: Bearer <access-token>
```

**Resposta:**

```json
{
  "scope": ["SCOPE_ANONYMOUS", "SCOPE_TEACHER", "SCOPE_STUDENT"],
  "login": "GUSTAVOBOAZ",
  "code": "123456"
}
```