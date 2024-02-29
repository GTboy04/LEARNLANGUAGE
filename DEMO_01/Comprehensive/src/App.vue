<script setup>
import {useRouter} from 'vue-router'

const router = useRouter()
function toGoods(){
  router.push('/goods')
}
</script>

<template>
  <div class="top">
    <button>
      <router-link to='/home'>Home</router-link>
    </button>
    <button>
      <router-link to='/list'>List</router-link>
    </button>
    <button>
      <router-link to='/goods'>Goods</router-link>
    </button>
    <button>
      <router-link to='/redirect'>Redirect</router-link>
    </button>
    <button>
      <router-link to='/update'>Update</router-link>
    </button>
    <button @click = toGoods()>函数跳转</button>
  </div>
  <RouterView></RouterView>
</template>

<style scoped>
.top {
background-color: brown;
height: 80px;
}

button {
  margin: 30px;
}
</style>
