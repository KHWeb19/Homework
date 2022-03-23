<template>
  <div>
    <div>
      <h2>login</h2>
    </div>

    <login-form @submit="onSubmit"></login-form>
  </div>
</template>

<script>

import LoginForm from "@/components/jpaMember/LoginForm";
import axios from "axios";

export default {
  name: "LoginTestPage",
  components: {
    LoginForm
  },
  methods: {
    onSubmit (payload){
      const {id, pw} = payload
      axios.post('http://localhost:7777/vueJpaMemberAuth/login', {id, pw})
      .then(res => {
          if(res.data){
            alert('로그인 성공')
          }
      })
      .catch(res => {
          alert(res.response.message)
      })
    }
  }
}
</script>

<style scoped>

</style>