import '../imports/api/fixtures'
import '../imports/api/methods'
import '../imports/api/publications'
import '../imports/api/models/auth/server'
import '../imports/api/models/publications/server' 
import '../imports/api/models/food/server'
import '../imports/api/models/Pet/server'

const SEED_USERNAME = 'meteorite';
const SEED_PASSWORD = 'password';
Meteor.startup(() => {
    if (!Accounts.findUserByUsername(SEED_USERNAME)) {
      Accounts.createUser({
        username: SEED_USERNAME,
        password: SEED_PASSWORD,
      });
    }
});