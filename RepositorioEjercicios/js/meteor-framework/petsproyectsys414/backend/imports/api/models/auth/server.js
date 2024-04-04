Meteor.methods({
    createUsers(form){
        try {
            Accounts.createUser({
                username:form.username,
                password:form.password,
                email:form.email,
                profile:{
                    lastname: form.lastname,
                    phone: form.phone,
                }
            })
            return {username: form.username, password: form.password};
        } catch (error) {
            throw new Meteor.Error(error)
        }
    }
});
