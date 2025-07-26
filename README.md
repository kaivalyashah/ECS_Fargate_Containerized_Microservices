# 🐳 TheEssentialQuo - Containerized Microservices on AWS ECS Fargate

This project demonstrates deploying a **multi-service microservices application** to **AWS ECS Fargate** using a fully automated CI/CD pipeline with **CodePipeline**, **CodeBuild**, and **ECR**.

It includes:
- Two sample microservices: `user-service` and `product-service` (built with Spring Boot & Java)
- Docker containerization
- Deployment to ECS Fargate, behind an Application Load Balancer (ALB)
- Infrastructure as Code (Terraform or AWS Console)
- Health checks, scaling, and automated build & deploy

---

## 🛠️ **Tech Stack & Tools**
- Java + Spring Boot
- Docker
- AWS ECS Fargate
- AWS ECR (Elastic Container Registry)
- AWS CodePipeline & CodeBuild (CI/CD)
- Application Load Balancer (ALB)
- GitHub (source control)
