<script setup>
import { RouterLink, RouterView } from 'vue-router';



</script>

<template>
  <div>
    <h1>路由前面</h1>
    <button>
      <RouterLink to="home">Home</RouterLink>
    </button>
    <button>
      <RouterLink to="list">List</RouterLink>
    </button>
    <button>
      <RouterLink to="update">Update</RouterLink>
    </button>
    <hr>
    <RouterView></RouterView>
    <hr>
    <h1>路由后面</h1>
  </div>
</template>

<style scoped>

button {
  margin-left: 10px;
}

</style>
