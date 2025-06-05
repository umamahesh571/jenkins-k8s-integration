# 🚀 EVOLVE E-Commerce – Full Setup & CI/CD Guide

A simple static e-commerce app built with Spring Boot, Maven, Docker, Jenkins, and Kubernetes.

## ✅ Step 1: Build with Maven
```bash
mvn clean package -DskipTests
```

## 🐳 Step 2: Docker Build & Push
```bash
docker build -t your-dockerhub/evolve-ecommerce .
docker login
docker push your-dockerhub/evolve-ecommerce
```

## ☸️ Step 3: Deploy to Kubernetes
```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```

## 🌐 Access App
- Home: `http://<node-ip>:30080/`
- Products API: `http://<node-ip>:30080/products`

## 🧪 Jenkins CI/CD
Configure Jenkins to clone, build with Maven, build/push Docker image, and run `kubectl`.