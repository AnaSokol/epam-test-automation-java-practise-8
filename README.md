Task
To add the following new functionalities to the project created in task 7:

To create interface **Prolongable** (prolonging deposit) and declare within it method
**canToProlong** without parameters that returns logic value true or false, depending
on the fact whether this specific deposit can be prolonged or not.

To implement interface **Prolongable** in classes **SpecialDeposit** and **LongDeposit**.
In addition, special deposit (**SpecialDeposit**) can be prolonged only when more than
1000 UAH were deposited, and long-term deposit (**LongDeposit**) can be prolonged
if the period of deposit is no longer than 3 years.

To implement standard generic interface **Comparable<Deposit>** in abstract class
**Deposit**. Total sum amount (sum deposited plus interest during entire period) should
be considered as comparison criteria of **Deposit** instances.

To implement additionally in class **Client**:
• interface **Iterable<Deposit>**.
• Method **sortDeposits**, which performs deposits sorting in array deposits in
descending order of total sum amount (sum deposited plus interest during entire period).
• Method **countPossibleToProlongDeposit**, which returns integer – amount
of current client’s deposits that can be prolonged.