# Multilevel Parking Lot System (Java)

## Overview

This project implements a **Multilevel Parking Lot System** using object-oriented design principles.
It supports different vehicle types, dynamic slot allocation, and billing based on parking duration.

The system is designed to be **extensible, modular, and scalable**, following clean separation of concerns.

---

## Features

### Parking Slot Types

* **Small** → for 2-wheelers
* **Medium** → for cars
* **Large** → for buses

---

### Vehicle Compatibility Rules

* Bike → Small / Medium / Large
* Car → Medium / Large
* Bus → Large only

---

### Core Functionalities

* Allocate nearest available slot based on entry gate
* Generate parking ticket on entry
* Calculate bill on exit
* Track real-time slot availability

---

## APIs Supported

### 1. Park Vehicle

```java
park(vehicle, entryTime, requestedSlotType, entryGateId)
```

* Assigns a slot
* Generates a ticket

---

### 2. Exit Vehicle

```java
exit(ticket, exitTime)
```

* Calculates duration
* Generates bill

---

### 3. Check Status

```java
status()
```

* Shows available slots by type

---

## System Design

### Key Components

* **ParkingLot**

  * Main controller for parking operations

* **ParkingSlot**

  * Represents a slot with type and occupancy

* **Vehicle**

  * Contains vehicle details and type

* **Ticket**

  * Stores entry details and assigned slot

* **SlotAllocator**

  * Core logic to assign nearest valid slot

* **BillingService**

  * Calculates cost based on slot type and duration

---

## Design Principles Used

* **Object-Oriented Design**
* **Separation of Concerns**
* **Encapsulation**
* **Single Responsibility Principle**

---

## Slot Allocation Strategy

1. Filter available slots
2. Check compatibility with vehicle type
3. Sort by distance from entry gate
4. Assign nearest slot

---

## Billing Logic

* Billing is based on **slot type**, not vehicle type
* Example:

  * Bike in Medium slot → charged as Medium

---

## Project Structure

```bash
src/
├── Main.java
├── ParkingLot.java
├── ParkingSlot.java
├── Vehicle.java
├── Ticket.java
├── SlotAllocator.java
├── BillingService.java
├── VehicleType.java
└── SlotType.java
```

---

## How to Run

```bash
javac *.java
java Main
```

---

## Example Flow

1. User enters vehicle details
2. System assigns nearest slot
3. Ticket is generated
4. On exit → bill is calculated

---

## Limitations (Current Version)

* No concurrency handling
* No persistence (in-memory only)
* Entry gate distance is simplified
* No UI (console-based)

---

## Future Improvements

* Multi-floor support
* Gate-based real distance calculation
* Pricing strategies (dynamic pricing)
* REST API integration
* Database support

---

## Author

j harish reddy

---
