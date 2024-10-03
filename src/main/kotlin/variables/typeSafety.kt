package variables

@JvmInline
value class EmployeeId(private val id: String);

@JvmInline
value class CustomerId(private val id: String);


fun main(args: Array<String>) {
    val customerId: CustomerId = CustomerId("Jane Smith");
    val employeeId: EmployeeId = EmployeeId("John Doe");

    addCustomer(customerId);
}

fun addCustomer(id: CustomerId) {
    println("Customer added!");
}