import java.awt.Point

fun main(args: Array<String>) {

}

// Binary search

//fun bs_list(heyStack:ArrayList<Int>,needle:Int) : Boolean{
//    var lo = 0;
//    var hi = heyStack.size;
//    do {
//        const val m = Math.floor((lo + (hi - lo)/2).toDouble());
//        const val v = heyStack[m.toInt()];
//        if (v == needle){
//            return  true;
//        }else if (v > needle){
//            hi = m.toInt();
//        }else if (v > needle){
//            lo = (m+1).toInt();
//        }
//    }while (lo < hi);
//    return  false;
//}


// Bubble Sort
//fun bubbleSort(arr: Array<Int>) {
//    for (i = 0 in arr.size; i++){
//        for (j = 0 in arr.size -1 ; j++){
//            if (arr[j] > arr[j+1]){
//                const val tmp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = tmp;
//            }
//        }
//    }
//}


// Queue
//type Node<T> = {
//    value:T,
//    next? : Node<T>,
//}
//class Queue<T>{
//    constructor(){
//        this.head = this.tail = undefined;
//        this.size = 0;
//    }
//    enqueue(item:T):void{
//        const val node = {value:item}as Node<T>;
//        this.size++;
//        if (!this.tail){
//            this.tail = this.head = node;
//            return;
//        }
//        this.tail.next = node;
//        this.tail = node;
//    }
//}


//STACK

//type Node<T> ={
//    value:T,
//    prev?:Node<T>,
//}
//class STACK<T>{
//    length:Int,
//    head?:Node<T>,
//    node.prev = this.head;
//    this.head = node;
//}
//pop():T | undefined{
//    this.size = Math.max(a,this.size -1);
//    if (this.size ==0){
//        const head = this.head;
//        this.head = undefined;
//        return head?.value;
//    }
//    const head = this.head as Node<T>;
//    this.head = head.prev;
//    return head.value;
//}
//peek():T | undefined{
//    return this.head?.value;
//}


// Recursion
// Maze Solver

//fun walk(
//    maze: Array<String>,
//    wall: String,
//    curr: Point,
//    end: Point,
//    seen: Array<Array<Boolean>>,
//    path: Array<Point>
//): Boolean {
//    if (curr.x < 0 || curr.x >= maze[0].size || curr.y < 0 || curr.y >= maze.size) {
//        return false;
//    }
//    if (maz[curr.y][curr.x] == wall) {
//        return false
//    }
//    if (curr.x == end.x && curr.y == end.y) {
//        return true;
//    }
//    if (seen[curr.y][curr.x]) {
//        return false
//    }
//    seen[curr.y][curr.x] = true;
//    path.push(curr);
//
//    //recurse
//    for (i in dir.size){
//        const val [x,y] = dir[i];
//        if (walk(maze,wall,{x:curr.x + x, y: curr.y+y,},end,seen,path)){
//            return true;
//        }
//    }
//    path.pop();
//    return false;
//}
//
//fun solve(maze: Array<String>, wall: Stirng, start: Point, end: Point) : Array<Point>{
//    const val seen:Array<Array<Boolean>> = [];
//    const val path:Array<Point> = [];
//    for (i in maze.size){
//        seen.push(new Array(maze[0].size).fill(false))
//    }
//    wall(maze,wall,start,end,seen,path);
//    return path;
//}





//// Breadth first search
//
//fun bfs(head:BinaryNode<Int>, needle:Int):Boolean{
//    while (q.size){
//        const val curr = q.shift()as BinaryNode<Int>;
//        if (!curr){
//            continue;
//        }
//        if (curr.value == needle){
//            return true;
//        }
//        q.push(curr.left);
//        q.push(curr.right);
//    }
//    return false;
//}





//Graph
//fun bfs(
//    graph:WeightAdjacencyMatrix,
//    source:Int,
//    needle:Int
//):Array<Int>{
//    const seen = new Array(graph.size).fill(false);
//    const prev = new Array(graph.size).fill(-1);
//    seen[source] = true;
//    const q:Array<Int>= [ source];
//    do {
//        const curr = q.shift() as Int;
//        if (curr == needle){
//            break
//        }
//        const adjs = graph[curr];
//        for (i in adj.size){
//            if (adjs[i] == 0){
//                continue
//            }
//            if (seen[i]){
//                continue
//            }
//            seen[i] = true;
//            prev[i] = curr;
//            q.push(i)l
//        }
//    }while (q.size);
//if (prev[needle]==-1){
//    return [];
//}
//    let curr = needle;
//    const out = Array<Int> = [];
//    while (prev[curr]!= -1){
//        out.push(curr);
//        curr = prev[curr];
//    }
//    return [source].concat(out.reserve());
//}
//
//
//
//
//
