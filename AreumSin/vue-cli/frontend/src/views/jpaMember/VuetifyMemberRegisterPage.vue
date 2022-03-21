<template>
  <div>
    <div align="center">
      <h2>회원 가입</h2>
    </div>

    <vuetify-member-register-form @submit="onSubmit"/>
  </div>
</template>

<script>
import axios from "axios";
import VuetifyMemberRegisterForm from "@/components/jpaMember/VuetifyMemberRegisterForm";

export default {
  name: "VuetifyMemberRegisterPage",
  components: {
    VuetifyMemberRegisterForm
  },
  methods: {
    onSubmit(payload) {
      const {id, pw} = payload
      axios.post('http://localhost:7777/vueJpaMember/register', {id, pw})
      .then(res => {
        alert('등록 성공' + res)
      })
      .catch(res => {
        alert(res.response.data.message)
      })
    }
  }
}
</script>

<style scoped>

</style>