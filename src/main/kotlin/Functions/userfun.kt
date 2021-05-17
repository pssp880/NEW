package Functions
fun main() {
    val nums = listOf(10, 20, 30)
    println(nums.sum())
    usersum();
}
fun usersum(){
    val nums = arrayOf(10, 20, 30)
    var sum=0
    for(i in nums){
      sum+=i
    }
    println(sum)
}