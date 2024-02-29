<script setup>
import {definePerson} from '../store/store'
import { ref } from 'vue'
let person = definePerson()

let name = ref('')
name.value = person.name;
</script>

<template>
  <div class="home">
    <h1>这里是Home.vue</h1>
    <hr>
    <input type="text" v-model="person.name">
  </div>

  <div class="pinia">
    {{ person }}
  </div>
</template>

<style scoped>
.home {
    background-color: pink;
    height: 100px;
}

.pinia{
    margin-top: 40px;
    background-color: silver;
    height: 200px;
}
</style>
