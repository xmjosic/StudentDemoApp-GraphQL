# Student demo app

Implementation and usage of:
- Spring GraphQL
- JPA
- H2

***
## Usage

Run the application and access GraphiQL console at http://localhost:8081/graphiql

### GraphQL queries
#### Add student

```graphql
mutation {
  addStudent(student: {firstName: "Chuck", lastName: "Norris", gender: "male"}) {
    id
    firstName
    lastName
    gender
  }
}
```

#### Get students

```graphql
query {
    getStudents{
        id
        firstName
        lastName
        gender
    }
}
```

#### Get students by id

```graphql
query {
    getStudentById(id: "1"){
        id
        firstName
        lastName
        gender
    }
}
```