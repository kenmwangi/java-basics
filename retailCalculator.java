import java.util.Scanner;

class RetailCalculator {
    public static void main(String args[]) {
        // Scanner Object
        Scanner keyboardInput = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the price of the commodity: $");
        double price = keyboardInput.nextDouble();

        System.out.print("Enter the quantity of the item: ");
        int quantity = keyboardInput.nextInt();

        System.out.print("Enter the discount % (if any): ");
        double discount = keyboardInput.nextDouble();

        System.out.print("Enter the sales tax %: ");
        double tax = keyboardInput.nextDouble();

        // Arithmetic Operations
        double subtotal = price * quantity;
        double discountAmount = subtotal * (discount / 100);
        double amountBeforeTax = subtotal - discountAmount;
        double taxAmount = amountBeforeTax * (tax / 100);
        double totalAmountWithTax = amountBeforeTax + taxAmount;
        // add $10 to totalAmountWithTax
        totalAmountWithTax += 10;

        // modulus operator to check if quantity is odd or even
        if (quantity % 2 == 0) {
            System.out.println("Quantity is EVEN");
        } else {
            System.out.println("Quantity is odd");
        }

        // decrementing discount
        discount--;
        // Incrementing quantity
        quantity++;

        // Retail Results
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Discount: $%.2f\n", discountAmount);
        System.out.printf("Amount before tax: $%.2f\n", amountBeforeTax);
        System.out.printf("Tax: $%.2f\n", taxAmount);
        System.out.printf("Total amount with tax: $%.2f\n", totalAmountWithTax);

        keyboardInput.close();

    }
}