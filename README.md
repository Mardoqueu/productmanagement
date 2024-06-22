
<h1 align="center">Welcome to Product Management API 👋</h1>
<p>
  <a href="https://twitter.com/SousaMardoqueu" target="_blank">
    <img alt="Twitter: SousaMardoqueu" src="https://img.shields.io/twitter/follow/SousaMardoqueu.svg?style=social" />
  </a>
</p>

> Product Management API
> Backend Developer Test

> Database: H2 (in-memory)

> Task: Create a microservice using Spring Boot, Spring Data JPA, Spring Security, JUnit, and Mockito.

> - Implement a CRUD for products and categories tables in this microservice.

> Delivery: zip file or GitHub.

### Project Description

The goal of this project is to develop a microservice for managing products and categories using modern technologies such as Spring Boot and Spring Data JPA. The application includes security with Spring Security and CSRF protection.

### Key Features

- Complete CRUD for managing products and categories.
- Authentication and authorization with Spring Security.
- CSRF protection.
- In-memory H2 database for easy development and testing.

### Testing via Postman

To test the endpoints via Postman, use the following credentials:

- **Username**: `superuser`
- **Password**: `password`

For endpoints that require CSRF protection, obtain the CSRF token by making a GET request and include it in the headers of your POST, PUT, and DELETE requests.

## Endpoints for Categories

| Method   | URL                                      | Description                              |
| -------- | ---------------------------------------- | ---------------------------------------- |
| `GET`    | `/api/categories`                        | Retrieve all categories.                 |
| `POST`   | `/api/categories`                        | Create a new category.                   |
| `GET`    | `/api/categories/{id}`                   | Retrieve category by id.                 |
| `PUT`    | `/api/categories/{id}`                   | Edit category by id.                     |
| `DELETE` | `/api/categories/{id}`                   | Delete category by id.                   |

## Endpoints for Products

| Method   | URL                                      | Description                              |
| -------- | ---------------------------------------- | ---------------------------------------- |
| `GET`    | `/api/products`                          | Retrieve all products.                   |
| `POST`   | `/api/products`                          | Create a new product.                    |
| `GET`    | `/api/products/{id}`                     | Retrieve product by id.                  |
| `PUT`    | `/api/products/{id}`                     | Edit product by id.                      |
| `DELETE` | `/api/products/{id}`                     | Delete product by id.                    |

## Author

👤 **Mardoqueu Sousa Telvina**

* Website: [Portfolio](https://mardoqueu.vercel.app/)
* Github: [@mardoqueu](https://github.com/mardoqueu)
* LinkedIn: [@mardoqueu-sousa](https://linkedin.com/in/mardoqueu-sousa)


