# Transaction Processing Service

## Overview
The Transaction Processing Service is responsible for handling transactions in the Investment and Trading Platform. It processes financial transactions, such as debiting or crediting amounts for orders, and communicates with other services like Order and User Services via RabbitMQ.

## Features
- Process transactions (debit/credit) for orders.
- Listen for transaction requests from the Order Service via RabbitMQ.
- Provide transaction status updates back to the Order Service via RabbitMQ.

## Requirements
- Java 11 or higher
- RabbitMQ (running locally)

## Setup

### 1. Clone the repository
Clone this repository to your local machine:
```bash
git clone https://github.com/yourusername/transaction-processing-service.git
cd transaction-processing-service
