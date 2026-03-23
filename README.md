# Parking Lot System (Java)

## Overview

This project is a basic implementation of a parking lot system using Java.  
It supports different vehicle types, slot allocation, and billing based on parking duration.

---

## Features

- Supports Bike, Car, and Bus  
- Different slot types: Small, Medium, Large  
- Allocates nearest available slot  
- Generates ticket on entry  
- Calculates bill on exit  
- Shows available slots  

---

## Vehicle Rules

- Bike → Small, Medium, Large  
- Car → Medium, Large  
- Bus → Large  

---

## Main Functions

```java
park(vehicle, entryTime, slotType, gateId)
exit(ticket, exitTime)
status()
```

---

## Project Structure

```bash
src/
Main.java
ParkingLot.java
ParkingSlot.java
Vehicle.java
Ticket.java
SlotAllocator.java
BillingService.java
VehicleType.java
SlotType.java
```

---

## Run

```bash
javac *.java
java Main
```

---
