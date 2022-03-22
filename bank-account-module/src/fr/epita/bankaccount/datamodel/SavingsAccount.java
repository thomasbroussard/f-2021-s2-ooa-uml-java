package fr.epita.bankaccount.datamodel;

public class SavingsAccount extends Account{

   protected double interestRate;

   public SavingsAccount(double initialBalance) {
      super(initialBalance);
   }

   public double computeInterests(){
      return this.interestRate * balance;
   }

   public void withDraw(double amount){
      this.balance -= amount;
   }


}
