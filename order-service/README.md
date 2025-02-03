# Order Service

## Overview
The Order Service is part of the Investment and Trading Platform. This service handles the creation of orders, order validation, and communication with other services such as Stock and Transaction services via RabbitMQ.

## Features
- Create and manage orders
- Interact with the Stock Service for stock availability
- Send transaction details to the Transaction Service via RabbitMQ

## Requirements
- Java 11 or higher
- PostgreSQL (running locally)
- RabbitMQ (running locally)

## Setup

### 1. Clone the repository
Clone this repository to your local machine:
```bash
git clone https://github.com/ishwetraj17/order-service.git
cd order-service
