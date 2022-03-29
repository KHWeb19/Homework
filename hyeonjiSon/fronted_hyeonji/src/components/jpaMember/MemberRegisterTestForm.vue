<template>
  <v-container>
    <form @submit.prevent="onSubmit">
      <table align="center" style="width: 500px;">
        <tr>
          <td>아이디</td>
          <td><input type="text" v-model="id"
          style="border-right: 0px solid; border-left: 0px solid; border-top: 0px solid; border-bottom: #6e6e6e 2px solid; border-style: dashed;" 
          :rules="idRule"
          ></td>
        </tr>
        <tr>
          <td>비밀번호</td>
          <td><input type="password" v-model="pw"
          style="border-right: 0px solid; border-left: 0px solid; border-top: 0px solid; border-bottom: #6e6e6e 2px solid; border-style: dashed;" 
          :rules="pwRule"
          ></td>
        </tr>
        <tr>
        <td>비밀번호 확인</td>
          <td><input type="password" v-model="pwConfirm"
            style="border-right: 0px solid; border-left: 0px solid; border-top: 0px solid; border-bottom: #6e6e6e 2px solid; border-style: dashed;" 
          :rules="rwConfirmRule"
          ></td>
        </tr>        
        <tr>
        <td>이메일</td>
          <td><input type="text" v-model="email1"
            style="border-right: 0px solid; border-left: 0px solid; border-top: 0px solid; border-bottom: #6e6e6e 2px solid; border-style: dashed;" 
          ></td>
          <p>@</p>
          <td><input type="text" v-model="email2"
            style="border-right: 0px solid; border-left: 0px solid; border-top: 0px solid; border-bottom: #6e6e6e 2px solid; border-style: dashed;" 
          ></td>
        </tr>
        <tr>
        <td>주소</td>
          <td><input type="text" v-model="address"
            style="border-right: 0px solid; border-left: 0px solid; border-top: 0px solid; border-bottom: #6e6e6e 2px solid; border-style: dashed;" 
          ></td>
        </tr>

<br>

      </table>

      <div align="center" style="width: 500px;">
        <button align="center" style="background-color:#d3f7ba; color:Green; width: 250px; height: 30px;" type="submit">가입</button>
      </div>
    </form>
  </v-container>
</template>

<script>
export default {
  name: "MemberRegisterTestForm.vue",
  data () {
    return {
      id: '',
      idRule: [
          v => !!v || '필수 입력 항목 입니다.',
      ],
      pw: '',
      pwRule: [
          v => this.state === 'ins' ? !!v || '필수 입력 항목 입니다.' : true,
          v => !(v.length <= 8 && v.length >= 32) || '영문자 대/소문자 특수문자, 숫자 포함 8 ~ 32자'
      ],
      pwConfirm: '',
      pwConfirmRule: [
          v => this.state === 'ins' ? !!v || '필수 입력 항목 입니다.' : true,
          v => v === this.user_pw || '패스워드가 일치하지 않습니다.'
      ],
      email1: '',
      email2: '',
      address: ''
    }
  },
  methods: {
    onSubmit () {
      const { id, pw, pwConfirm, email, address } = this
      this.$emit('submit', { id, pw, pwConfirm, email, address })
    }
  }
}
</script>