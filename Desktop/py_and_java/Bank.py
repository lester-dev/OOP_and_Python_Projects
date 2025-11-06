class BankAccount:
    def __init__(self, initial_balance=0):
        # Private attribute
        self.__balance = initial_balance
    
    # Method to deposit money
    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            print(f"Deposited {amount}. New balance: {self.__balance}")
        else:
            print("Deposit amount must be positive.")
    
    # Method to withdraw money
    def withdraw(self, amount):
        if amount > 0 and amount <= self.__balance:
            self.__balance -= amount
            print(f"Withdrew {amount}. New balance: {self.__balance}")
        elif amount > self.__balance:
            print("Insufficient funds.")
        else:
            print("Withdrawal amount must be positive.")
    
    # Method to get the current balance
    def get_balance(self):
        return self.__balance

# Create an instance of BankAccount with an initial balance
account = BankAccount(1000)

# Deposit money
account.deposit(500)

# Withdraw money
account.withdraw(200)

# Get the current balance
print(f"Current balance: {account.get_balance()}")
