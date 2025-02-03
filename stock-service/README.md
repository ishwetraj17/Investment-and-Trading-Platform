# Stock Service

## Overview
The Stock Service is responsible for managing stock data, including stock availability and prices. It interacts with the Order Service to check the stock before processing orders and helps manage real-time trade data.

## Features
- Manage and check stock availability
- Interact with the Order Service to verify stock before creating orders
- Supports communication with RabbitMQ for data exchange

## Requirements
- Java 11 or higher
- PostgreSQL (running locally)
- RabbitMQ (running locally)

## Setup

### 1. Clone the repository
Clone this repository to your local machine:
```bash
git clone https://github.com/ishwetraj17/stock-service.git
cd stock-service
