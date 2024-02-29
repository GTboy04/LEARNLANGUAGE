<script setup>
import {definePerson} from '../store/store'
let person = definePerson()
</script>

<template>
  <div class="home">
    <h1>这里是Update.vue</h1>
  </div>
  <div class="pinia">
    {{ person }}
  </div>
</template>

<style scoped>
.home {
    background-color: beige;
    height: 100px;
}
.pinia{
    margin-top: 40px;
    background-color: silver;
    height: 200px;
}
</style>
