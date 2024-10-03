package oop

interface ProductService{
    fun add();
    fun delete();
}

class ProductManager: ProductService{
    override fun add(){
        println("Adding product")
    }

    override fun delete(){
        println("Deleting product")
    }
}