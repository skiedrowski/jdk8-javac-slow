package d;

import static com.natpryce.makeiteasy.Property.newProperty;

import java.util.Set;
import java.util.SortedSet;

import com.natpryce.makeiteasy.Instantiator;
import com.natpryce.makeiteasy.Property;
import com.natpryce.makeiteasy.PropertyLookup;

class ArticleFix {

	Article withId(final String id) {
		return null;
	}
}

class EArticleMaker {

	static Instantiator<EArticle> EArticleFor(final Article article) {
		return new Instantiator<EArticle>() {

			@Override
			public EArticle instantiate(final PropertyLookup<EArticle> lookup) {
				return new EArticle();
			}
		};
	}
}

class OEPMaker {

	static final Property<OEP, Set<SP>> withoutPrescriptionSubProcesses = newProperty();

	static final Instantiator<OEP> OEP = new Instantiator<OEP>() {

		@Override
		public OEP instantiate(final PropertyLookup<OEP> lookup) {
			return new OEP();
		}
	};
}

class OEPItemMaker {

	static final Property<OEPItem, EArticle> eArticle = newProperty();

	static final Instantiator<OEPItem> OEPItem = new Instantiator<OEPItem>() {

		@Override
		public OEPItem instantiate(final PropertyLookup<OEPItem> lookup) {
			return new OEPItem();
		}
	};
}

class SPMaker {

	static final Property<SP, SortedSet<OEPItem>> items = newProperty();

	static final Instantiator<SP> WPSP = new Instantiator<SP>() {

		@Override
		public SP instantiate(final PropertyLookup<SP> lookup) {
			return new SP();
		}
	};
}

