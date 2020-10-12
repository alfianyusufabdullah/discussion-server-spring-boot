# API Discussions Spec

## Added new discussion

- Method: POST
- Endpoint: `api/discussion`
- Header: 
    - Content-type: `application/json`
    - Accept: `application/json`
- Request:
```json
{
   "creator_username": "String",
   "title": "String",
   "question": "String"
}
```
- Response:
```json
{
    "status": "Int",
    "message": "String",
    "data": {
         "id_discussion": "String",
         "creator_username": "String",
         "created_at": "Date",
         "title": "String",
         "question": "String"
    }
}
```

## Getting all discussion

- Method: GET
- Endpoint: `api/discussion`
- Header: 
    - Accept: `application/json`
- Response Success:
```json
{
    "status": "Int",
    "message": "String",
    "data": {
         "total": "Int",
         "page": "Int",
         "discussions": [
                  {
                      "id_discussion": "String",
                      "creator_username": "String",
                      "created_at": "Date",
                      "title": "String",
                      "question": "String",
                      "reply": "Int"
                  },
                  {
                      "id_discussion": "String",
                      "creator_username": "String",
                      "created_at": "Date",
                      "title": "String",
                      "question": "String",
                      "reply": "Int"                          
                  }
              ]
    }
}
```
- Response Empty:
```json
{
    "status": "Int",
    "message": "String"
}
```

## Reply Discussion

- Method: POST
- Endpoint: `api/discussion`
- Header: 
    - Content-type: `application/json`
    - Accept: `application/json`
- Request:
```json
{
   "id_parent": "String",
   "creator_username": "String",
   "comment": "String"
}
```
- Response:
```json
{
    "status": "Int",
    "message": "String",
    "data": {
         "id_discussion": "String",
         "id_comment": "String",
         "creator_username": "String",
         "created_at": "Date",
         "title": "String",
         "comment": "String"
    }
}
```
