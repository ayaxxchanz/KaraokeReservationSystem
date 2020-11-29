# KaraokeReservationSystem

Process: 
- Room Rate 
  - 1-4 people
    - Set A (Normal Package)
      - RM 21 + 6% tax (per hour)
      - Deluxe Room
      - Foods & drinks not included
      - Student price (>=18 years old && < 21 years old) : 
      - Discount 20% off after total price
      - Total price
        - If (< 18 years old)
          - Output: “Children are not allowed”
        - If (>= 18 years old && < 21 years old)
          - Total price = [ 21 + (6/100 * 21) ] * hour * 80/100
        - If (>= 21years old)
          - Total price = [ 21 + (6/100 * 21) ] * hour

    - Set B (Normal Package)
      - M 30 + 6% tax (per hour)
      - Deluxe Room
      - Foods & drinks included
      - Student price (>=18 years old && < 21 years old) : 
        - Discount 20% off after total price 
      - Total price
        - If (< 18 years old)
          - Output: “Children are not allowed”
        - If (>= 18 years old && < 21 years old)
          - Total price = [ 30 + (6/100 * 30) ] * hour * 80/100
        - If (>= 21years old)
          - Total price = [ 30 + (6/100 * 30) ] * hour
 
    - Set C (VIP Package)
      - RM 40 + 6% tax (per hour)
      - Master Room 
      - Foods & drinks included
      - Student price (>=18 years old && < 21 years old) : 
         - Discount 20% off after total price 
      - Total price
        - If (< 18 years old)
          - Output: “Children are not allowed”
        - If (>= 18 years old && < 21 years old)
          - Total price = [ 40 + (6/100 * 40) ] * hour * 80/100
        - If (>= 21years old)
          - Total price = [ 40 + (6/100 * 40) ] * hour

  - More than 5 people
    - RM 15 + 6% tax (per person/hour)
    - Master Room
    - Foods & drinks included
    - Student price (>=18 years old && < 21 years old) : 
      - Discount 20% off after total price
    - Total price
      - If (< 18 years old)
        - Output: “Children are not allowed”
      - If (>= 18 years old && < 21 years old)
        - Total price = [ 15 + (6/100 * 15) ] * person * hour * 80/100
      - If (>= 21years old)
        - Total price = [ 15 + (6/100 * 15) ] * person * hour
***

Output: 
- Name
- Identification Card No
- Email
- No Phone
- Time of booking
- Date reservation
- Hours of reservation
- Booking Number
- Room Rate (1-4 people / >5 people) 
- Type of package (Set A/B/C/More than 5)
- Total Price (after discount- if available)

Output File : Rooms that had been booked
