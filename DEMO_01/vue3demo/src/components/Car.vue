<script setup lang="ts">
    import { ref,reactive} from "vue";

    let CarName = ref('保时捷')
    let price = ref(100)

    let Cars = reactive([
        {
            Car:"保时捷",
            price:100
        },
        {
            Car:"大众",
            price:16
        },
        {
            Car:"POLO",
            price:30
        }
    ])

    let obj1 = reactive({
        obj2:{
            obj3:{
                obj4:4
            }
        }
    })

    //深入修改
    function deepChange(){
        obj1.obj2.obj3.obj4 += 1
    }
    //改变车名
    function changeName():void{
        CarName.value += 'V'
    }
    //改变价格
    function alterPrice() {
        price.value += 10
    }

    //改变第一辆车的价格
    function changeFirstPrice(){
        Cars[0].price += 10
    }


</script>

<template>
    <div class="Car">
        <h1>品牌:{{ CarName }}</h1>
        <h1>价格:{{ price }}-万</h1>
        <ul>
            <li v-for="Car in Cars" :key = Car.price>品牌：{{ Car.Car }}-价格：{{ Car.price }}</li>
        </ul>

        <h1>{{ obj1.obj2.obj3.obj4 }}</h1>
        <hr>
        <br> 
        <button @click = changeName>修改品牌</button>
        <button @click = alterPrice>修改价格</button>
        <button @click = changeFirstPrice>修改第一辆车的价格</button>
        <button @click = deepChange>修改深层次数据</button>
    </div>
</template>

<style scoped>
     .Car {
        width: 100%;
        height: auto;
        border-radius: 10px;
        background-color: skyblue;
     }

     button {
        margin-left:10px;
     }
</style>