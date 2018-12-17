#ifndef PANGRAM_PANGRAM_H
#define PANGRAM_PANGRAM_H
#define EXERCISM_RUN_ALL_TESTS
#include <string>
#include <set>
#include <cctype>

namespace pangram{
    bool is_pangram( std::string sentence ){
        std::set<char> storage;
        for ( char &it : sentence ) {
            if ( isupper( it ) )
                storage.insert(static_cast<char &&>(std::tolower(it )));
            if ( islower( it ) )
                storage.insert( it );
        }
        return storage.size() == 26;
    }
}

#endif
