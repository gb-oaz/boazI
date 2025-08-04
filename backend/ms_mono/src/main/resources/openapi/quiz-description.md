# 🧩 Fluxo de Utilização da API de Quiz

## 1. Criar um Novo Quiz

**Endpoint:**

`POST /quiz/v1/post/new/quiz/COMMAND_POST_NEW_QUIZ`

**Parâmetros:**

- `categories`: conjunto de strings representando as categorias.

**Headers:**

```
Authorization: Bearer <teacher-token>
Content-Type: multipart/form-data
```

**Body:**

- `login`: mínimo 8 caracteres em letras maiúsculas.

- `code`: mínimo 6 dígitos numéricos.

- `name`: entre 3 e 40 caracteres.

**Resposta:**

```json
{
  "key": "<quiz-key-id>"
}
```

---

## 2. Adicionar Item ao Quiz

**Endpoint:**
`POST /quiz/v1/post/quiz/{key}/item/{position}/COMMAND_POST_QUIZ_ITEM`

**Headers:**
```
Authorization: Bearer <teacher-token>
Content-Type: application/json
```

**Body:**
Dependendo do tipo de item (`quizType` ou `slideType`), o corpo da requisição varia. Exemplos incluem:

- **QUIZ_MULTIPLE_CHOICE**
```json
{
  "contentQuestion": "Quais desses são planetas do sistema solar?",
  "alternatives": ["Marte", "Plutão", "Sirius", "Júpiter"],
  "answers": ["Marte", "Júpiter"],
  "timerSeconds": 40,
  "reward": 25
}
```

**Resposta:**
```json
{
  "key": "<quiz-key-id>"
}
```

---

## 3. Atualizar Item do Quiz

**Endpoint:**
`PATCH /quiz/v1/patch/quiz/{key}/item/{position}/COMMAND_PATCH_QUIZ_ITEM`

**Headers:**
```
Authorization: Bearer <teacher-token>
Content-Type: application/json
```

**Body:**
Mesmo formato do item a ser atualizado.

**Resposta:**
```json
{
  "key": "<quiz-key-id>"
}
```

---

## 4. Atualizar Quiz

**Endpoint:**
`PUT /quiz/v1/put/quiz/{key}/COMMAND_PUT_QUIZ`

**Parâmetros:**

- `categories`: conjunto de strings representando as categorias.

**Headers:**

```
Authorization: Bearer <teacher-token>
Content-Type: multipart/form-data
```

**Body:**

- `name`: novo nome do quiz.

**Resposta:**

```json
{
  "key": "<quiz-key-id>"
}
```

---

## 5. Remover Item do Quiz

**Endpoint:**

`DELETE /quiz/v1/delete/quiz/{key}/item/{position}/COMMAND_DELETE_QUIZ_ITEM`

**Headers:**

```
Authorization: Bearer <teacher-token>
```

**Resposta:**

```json
{
  "key": "<quiz-key-id>"
}
```

---

## 6. Remover Quiz

**Endpoint:**

`DELETE /quiz/v1/delete/quiz/{key}/COMMAND_DELETE_QUIZ`

**Headers:**

```
Authorization: Bearer <teacher-token>
```

**Resposta:**

```json
{
  "key": "<quiz-key-id>"
}
```

---

## 7. Consultar Quiz

**Endpoint:**

`GET /quiz/v1/get/quiz/{key}/QUERY_GET_QUIZ`

**Headers:**

```
Authorization: Bearer <token>
```

**Resposta:**

```json
{
  "key": "f7a4c1d2e3",
  "name": "Quiz de Inovação",
  "categories": ["tecnologia", "transformação"],
  "quizes": [...]
}
```

---

## 8. Consultar Projeção de Quizzes

**Endpoint:**

`GET /quiz/v1/get/quizes/projection/QUERY_GET_QUIZES_PROJECTION`

**Headers:**
```
Authorization: Bearer <token>
```

**Params:**

```
login=GUSTAVOBOAZ
code=123456
name=Quiz de Inovação
categories=tecnologia,transformação
page=1
size=10
```

**Resposta:**

```json
{
  "content": [...],
  "pageable": {
    "page": 1,
    "size": 10,
    "total": 1
  }
}
```

---

## 9. Consultar Item do Quiz

**Endpoint:**

`GET /quiz/v1/get/quiz/{key}/item/{position}/QUERY_GET_QUIZ_ITEM`

**Headers:**

```
Authorization: Bearer <teacher-token>
```

**Resposta:**

```json
{
  "position": 2,
  "contentQuestion": "A transformação digital exige mudanças culturais?",
  "answers": [true],
  "timerSeconds": 20,
  "reward": 50,
  "type": "QUIZ_TRUE_FALSE"
}
```